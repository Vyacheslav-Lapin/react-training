package ru.vlapin.experiments.reacttraining.controllers;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vlapin.experiments.reacttraining.model.Post;
import ru.vlapin.experiments.reacttraining.services.JSONPlaceHolderClient;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/posts")
public class JsonPlaceholder {

  JSONPlaceHolderClient jsonPlaceHolderClient;

  @GetMapping
  public List<Post> getPosts() {
    return jsonPlaceHolderClient.getPosts();
  }

  @GetMapping("{postId}")
  Post getPostById(@PathVariable Long postId) {
    return jsonPlaceHolderClient.getPostById(postId);
  }
}
