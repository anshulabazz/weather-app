package com.tera.codingtest.service;

public class PostRepoistory implements PostService {
@Repository
	public PagedResponse<Post> getAllPosts(int page, int size) {
		// TODO Auto-generated method stub
	
			Page<Post> findByCreatedBy(Long userId, Pageable pageable);

			Page<Post> findByCategory(Long categoryId, Pageable pageable);

			Page<Post> findByTags(List<Tag> tags, Pageable pageable);

			Long countByCreatedBy(Long userId);
	}

}
