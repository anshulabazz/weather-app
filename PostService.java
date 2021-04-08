package com.tera.codingtest.service;

public interface PostService {

	PagedResponse<Post> getAllPosts(int page, int size)
}