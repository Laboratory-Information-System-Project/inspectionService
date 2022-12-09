package com.douzone.inspectionservice.service.Kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public String send(String topic, String status, List<String> prescribeCode){
        System.out.println("안에 들어 있는 정보"+prescribeCode);
        Map<String, Object> data = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        data.put("\"prescribeCodeList\"", prescribeCode);
        data.put("\"status\"", status);

        try{
            json = mapper.writeValueAsString(data);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

        kafkaTemplate.send(topic, json);

        return status;
    }

    public void send(String topic, String barcode, String orderCode){
        Map<String, Object> data = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        data.put("barcode", barcode);
        data.put("orderCode", orderCode);

        try{
            json = mapper.writeValueAsString(data);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

        kafkaTemplate.send(topic, json);
    }
}
