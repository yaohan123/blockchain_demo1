package com.yaohan.postlike.controller;

import com.yaohan.postlike.service.PostLikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @Autowired
    PostLikedService postLikedService;

    @RequestMapping(value = "/postLike", method = RequestMethod.POST)
    public void  PostLike(@RequestParam(value = "videoId",required = true) Integer videoId){
        postLikedService.postLike(videoId);
    }


}
