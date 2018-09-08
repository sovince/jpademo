package com.sovince.jpademo.dao;

import com.sovince.jpademo.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2018/9/8
 * Time: 17:25
 */
public interface CommentResitory extends JpaRepository<Comment,Long> {
    Comment getByCommentIdIs(long id);
}
