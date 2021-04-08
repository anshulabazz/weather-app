package com.tera.codingtest.service;
	
	
	@Repository
	public interface CommentRepository extends JpaRepository<Comment, Long> {
		Page<Comment> findByPostId(Long postId, Pageable pageable);
	}

}
