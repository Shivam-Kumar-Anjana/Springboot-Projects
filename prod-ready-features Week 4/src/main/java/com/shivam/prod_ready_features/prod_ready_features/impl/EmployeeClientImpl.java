package com.shivam.prod_ready_features.prod_ready_features.impl;

import com.shivam.prod_ready_features.prod_ready_features.advice.ApiResponse;
import com.shivam.prod_ready_features.prod_ready_features.clients.EmployeeClient;
import com.shivam.prod_ready_features.prod_ready_features.dto.EmployeeDTO;
import com.shivam.prod_ready_features.prod_ready_features.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeClientImpl implements EmployeeClient {

    private final RestClient restClient;

    Logger log = LoggerFactory.getLogger(EmployeeClientImpl.class);

    @Override
    public List<EmployeeDTO> getAllEmployees() {

        //log.warn("Warn");
        log.trace("Trying to retrieve all employees in getAllEmployees");

        try{
            log.info("Attempting to call the restClient method in getAllEmployees");

            ApiResponse<List<EmployeeDTO>> employeeDTOList = restClient.get()
                    .uri("employees")
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError, (req, res) ->{
                        log.error(new String(res.getBody().readAllBytes()));
                        throw new ResourceNotFoundException("Could not find the resource");
                    })
                    .body(new ParameterizedTypeReference<>() {
                    });
            log.debug("Successfully retrieved all the employees");
            log.trace("Retrieved Emplyees list in getAllEmployees: {}", employeeDTOList.getData(), "Hello", 5);

            return employeeDTOList.getData();

        } catch (Exception e) {
            log.error("Exception occured in getAllEmployees", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {

        log.trace("Trying to get employee by ID  getEmployeeById with Id: {}", employeeId);

        try{
            ApiResponse<EmployeeDTO> employeeResponse = restClient.get()
                    .uri("employees/{employeeId}", employeeId)
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError, (req, res) ->{
                        log.error(new String(res.getBody().readAllBytes()));
                        throw new ResourceNotFoundException("Could not find the resource");
                    })
                    .body(new ParameterizedTypeReference<>() {
                    });
            return employeeResponse.getData();
        }
        catch (Exception e) {
            log.error("Exception occured in getAllEmployees");
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {

        log.trace("Trying to create employee by details with Details: {}", employeeDTO);

        try{
            ResponseEntity<ApiResponse<EmployeeDTO>> employeeDTOApiResponse = restClient.post()
                    .uri("employees")
                    .body(employeeDTO)
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError, (req, res) ->{
                        log.error(new String(res.getBody().readAllBytes()));
                        log.debug("is4xxClientError error occured during CreateNewEmployee");
                        throw new ResourceNotFoundException("Could not find the resource");
                    })
                    .toEntity(new ParameterizedTypeReference<>() {
                    });
            log.trace("Successfully created new employee : {}", employeeDTOApiResponse.getBody());
            return employeeDTOApiResponse.getBody().getData();
        }catch (Exception e){
            log.error("Exception occured in createNewEmployee", e);
            throw new RuntimeException(e);
        }
    }
}
