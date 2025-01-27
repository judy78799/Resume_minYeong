package com.eco.resume_minYeongPark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
  @RequestMapping("/api/movie")
  public List<String> MovieList()
  {
    return Arrays.asList("영화보기", "Movie");
  }
}
