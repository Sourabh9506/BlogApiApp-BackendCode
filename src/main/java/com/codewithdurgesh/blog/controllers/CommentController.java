package com.codewithdurgesh.blog.controllers;
import com.codewithdurgesh.blog.payloads.ApiResponse;
import com.codewithdurgesh.blog.payloads.CommentDto;
import com.codewithdurgesh.blog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/user/{userId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId,@PathVariable Integer userId) {

        CommentDto createCommentDto= this.commentService.createComment(commentDto,postId,userId);
        return new ResponseEntity<CommentDto>(createCommentDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/comments/{commentID}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentID) {

       this.commentService.deleteComment(commentID);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted successfully !!",true), HttpStatus.OK);
    }
}
