package git.olinh.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * docker容器测试控制器
 *
 * @author olinH, olinone666@gmail.com
 * @version v1.0.0
 * @since 2022-05-27
 */
@RestController
@RequestMapping("/docker-test")
public class DockerTestController {

    @GetMapping("/echo")
    public String echo() {
        return "hello, docker!";
    }
}
