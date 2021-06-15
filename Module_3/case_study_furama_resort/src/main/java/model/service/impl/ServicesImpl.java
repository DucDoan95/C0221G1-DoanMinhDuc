package model.service.impl;

import model.bean.Services;
import model.repository.services.ServicesRepository;
import model.service.IServices;
import model.service.common.Validate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicesImpl implements IServices {
    ServicesRepository servicesRepository = new ServicesRepository();
    @Override
    public Map<String,String> createService(Services services) {
        Map<String,String> mapMsg = new HashMap<>();
        boolean flag =true;

        if("".equals(services.getServiceName())){
            mapMsg.put("name","Please input Service Name!");
            flag = false;
        }

        if("".equals(services.getServiceID())){
            mapMsg.put("id","Please input Customer ID");
            flag=false;
        }else if(!Validate.checkServiceID(services.getServiceID())){
            mapMsg.put("id","Invalid format  Hint: DV-XXXX (X is number 0-9)");
            flag=false;
        }


        if("".equals(services.getNumberOfFloors())){
            mapMsg.put("floor","Please input Number of Floor");
            flag=false;
        }else if(!Validate.checkPositiveNumber(services.getNumberOfFloors())){
            mapMsg.put("floor","Invalid. Number of Floor>0");
            flag=false;
        }


        if("".equals(services.getPoolArea())){
            mapMsg.put("poolArea","Please input Service Pool Area");
            flag=false;
        }else if(!Validate.checkMoney(services.getPoolArea())){
            mapMsg.put("poolArea","Invalid .Pool Area >0");
            flag=false;
        }

        if("".equals(services.getServiceCost())){
            mapMsg.put("cost","Please input Service Cost");
            flag=false;
        }else if(!Validate.checkMoney(services.getServiceCost()+"")){
            mapMsg.put("cost","Invalid Cost >0");
            flag=false;
        }

        if("".equals(services.getServiceArea())){
            mapMsg.put("area","Please input Service Cost");
            flag=false;
        }else if(!Validate.checkMoney(services.getServiceArea()+"")){
            mapMsg.put("area","Invalid Cost >0");
            flag=false;
        }

        if("".equals(services.getServiceMaxPeople())){
            mapMsg.put("maxPeople","Please input Max People");
            flag=false;
        }else if(!Validate.checkMoney(services.getServiceMaxPeople()+"")){
            mapMsg.put("maxPeople","Invalid Max People >0");
            flag=false;
        }

        if("".equals(services.getDescriptionOtherConvenience())){
            mapMsg.put("description","Please input Service Description");
            flag=false;
        }

        if("".equals(services.getStandardRoom())){
            mapMsg.put("standardRoom","Please input Service StandardRoom");
            flag=false;
        }


        if(flag){
            servicesRepository.createService(services);
        }
        return mapMsg;
    }

    @Override
    public Services findServiceByID(String id) {
        return servicesRepository.findServiceByID(id);
    }

    @Override
    public List<Services> getAllServices() {
        return servicesRepository.getAllServices();
    }
}
