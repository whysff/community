package io.whysff.community.service;

import io.whysff.community.entity.DiscussPost;

import java.util.List;

public interface DiscussPostService {

    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);

    int findDiscussPostRows(int userId);
}
