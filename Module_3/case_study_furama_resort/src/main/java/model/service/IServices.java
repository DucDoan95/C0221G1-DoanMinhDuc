package model.service;



import model.bean.Employee;
import model.bean.Services;

import java.util.List;
import java.util.Map;

public interface IServices {
    public Map<String,String> createService(Services services);
    public Services findServiceByID(String id);
    public List<Services> getAllServices();
}
