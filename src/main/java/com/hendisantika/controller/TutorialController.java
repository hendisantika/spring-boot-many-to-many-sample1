package com.hendisantika.controller;

import com.hendisantika.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-many-to-many-sample1
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/3/22
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TutorialController {

    private final TutorialRepository tutorialRepository;
}
