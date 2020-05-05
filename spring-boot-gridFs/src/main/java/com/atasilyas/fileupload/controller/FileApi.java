package com.atasilyas.fileupload.controller;

import com.atasilyas.fileupload.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
@RequiredArgsConstructor
public class FileApi {

    private final FileUploadService fileUploadService;

    @PostMapping("uploadFile")
    public void uploadFile(@RequestParam MultipartFile multipartFile){
        fileUploadService.uploadFile(multipartFile);
    }
}
