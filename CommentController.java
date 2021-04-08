package com.tera.codingtest.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


RestController
@RequestMapping("/api/posts/{postId}/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;

	@GetMapping
	public ResponseEntity<PagedResponse<Comment>> getAllComments(@PathVariable(name = "postId") Long postId,
			@RequestParam(name = "page", required = false, defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) Integer page,
			@RequestParam(name = "size", required = false, defaultValue = AppConstants.DEFAULT_PAGE_SIZE) Integer size) {

		PagedResponse<Comment> allComments = commentService.getAllComments(postId);

		return new ResponseEntity< >(allComments, HttpStatus.OK);
	}

}
