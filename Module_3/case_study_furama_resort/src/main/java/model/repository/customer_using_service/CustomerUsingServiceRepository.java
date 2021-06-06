package model.repository.customer_using_service;

import model.bean.CustomerType;
import model.bean.CustomerUsingService;
import model.repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerUsingServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String GET_ALL_CUSTOMER_USING_SERVICE ="select *from customer_using_service;";

    public List<CustomerUsingService> getAllCustomerUsingService() {
        Connection connection = baseRepository.connectDatabase();
        List<CustomerUsingService> customerUsingServiceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CUSTOMER_USING_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                int contractId = resultSet.getInt("contract_id");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                String serviceName = resultSet.getString("service_name");
                String attachServiceName = resultSet.getString("attach_service_name");
                int quantity = resultSet.getInt("quantity");
                CustomerUsingService customerUsingService = new CustomerUsingService(customerId,customerName,contractId,contractStartDate,contractEndDate,serviceName,attachServiceName,quantity);
                customerUsingServiceList.add(customerUsingService);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerUsingServiceList;

    }
}
