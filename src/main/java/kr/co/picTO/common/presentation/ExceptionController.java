package kr.co.picTO.common.presentation;

import kr.co.picTO.common.exception.CustomAuthenticationEntryPointException;
import kr.co.picTO.common.domain.CommonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/exception")
public class ExceptionController {

    @GetMapping(value = "/entrypoint")
    public CommonResult entrypointException() {
        throw new CustomAuthenticationEntryPointException();
    }

    @GetMapping(value = "/accessDenied")
    public CommonResult accessDeniedException() {
        throw new AccessDeniedException("Access Denied");
    }
}
