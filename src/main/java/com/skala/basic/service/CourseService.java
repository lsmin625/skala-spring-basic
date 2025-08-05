package com.skala.basic.service;

import org.springframework.stereotype.Service;

import com.skala.basic.data.CourseResponse;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Service
@Slf4j
public class CourseService {

  public CourseResponse createCourse(String name, List<String> topics) {
    log.info("topics-size={}", topics.size());

    CourseResponse response = new CourseResponse();
    response.setName(name);
    response.setTopics(topics);

    String desc = String.format(
        "%s님이 관심 있는 교과과정: %s",
        name, String.join(", ", topics));
    response.setDescription(desc);

    return response;
  }
}
