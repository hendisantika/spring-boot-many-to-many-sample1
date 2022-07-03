package com.hendisantika.repository;

import com.hendisantika.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-many-to-many-sample1
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/3/22
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    List<Tutorial> findTutorialsByTagsId(Long tagId);
}
