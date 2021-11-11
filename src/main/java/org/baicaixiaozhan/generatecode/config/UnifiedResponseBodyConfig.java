package org.baicaixiaozhan.generatecode.config;

import org.baicaixiaozhan.generatecode.entity.model.ResultTemplate;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * DESC: 统一消息体返回配置
 *
 * @author baicaixiaozhan
 * @since 1.0.0
 */
@ControllerAdvice
public class UnifiedResponseBodyConfig implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return Boolean.FALSE.equals(returnType.getMethod().getReturnType().isAssignableFrom(ResultTemplate.class));
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {
        return ResultTemplate.ok(body);
    }
}
