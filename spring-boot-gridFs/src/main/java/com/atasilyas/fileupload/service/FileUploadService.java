package com.atasilyas.fileupload.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileUploadService {

  @Autowired private GridFsTemplate gridFsTemplate;

  public void uploadFile(MultipartFile multipartFile) {

    try {
      DBObject dbObject = new BasicDBObject();
      dbObject.put("fileFullName", multipartFile.getOriginalFilename());
      dbObject.put("contentType", multipartFile.getContentType());
      dbObject.put("fileFullName", multipartFile.getSize());
      ObjectId id =  gridFsTemplate.store(multipartFile.getInputStream(),multipartFile.getOriginalFilename() ,dbObject);
      // with ObjectId which is below we can save file id to another db for query later
      System.out.println(id);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("error accured!!!");
    }
  }
}
