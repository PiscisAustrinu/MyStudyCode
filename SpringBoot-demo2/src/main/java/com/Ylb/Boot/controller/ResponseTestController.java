package com.Ylb.Boot.controller;

import com.Ylb.Boot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/31 14:34
 * Description:
 */
@Controller
public class ResponseTestController {
    /**
     * 本方法用来探究服务器如何响应JSON
     * 1、通过返回值解析器HandlerMethodReturnValueHandlerComposite找到对应的 方法处理器 RequestResponseBodyMethodProcessor
     *      1、返回值处理器判断是否支持这种类型的返回值boolean supportsReturnType(MethodParameter returnType);
     *      2、返回值处理器调用 void handleReturnValue(@Nullable Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer, NativeWebRequest webRequest) throws Exception;
     *      处理返回值
     *      3、RequestResponseBodyMethodProcessor 处理标注了@ResponseBody和@RequestBody的注解
     *          利用MessageConverters进行处理，将数据写为JSON
     *              1、内容协商（浏览器默认会以请求头的方式告诉服务器他能接受什么样的内容类型）
     *                  内容协商原理：
     *                      1、判断当前响应头中是否已经有确定的媒体类型MediaType
     *                      2、获取客户端（PostMan、浏览器）支持接收的内容类型
     *                          contentNegotiationManager内容协商管理器默认使用基于请求头的策略
     *                          HeaderContentNegotiationStrategy确认客户端可以接收的类型
     *                      3、遍历循环所有当前系统的MessageConverter，看谁支持操作这个对象（Person）
     *                      4、找到支持操作Person的converter，把converter支持的媒体类型统计出来
     *                      5、客户端需要【application/xml】。服务端能力【10种、JSON、xml】
     *                      6、进行内容协商的最佳匹配媒体类型
     *                      7、用支持将Person转换为xml类型的converter进行转换
     *              2、服务器会根据自己自身的能力，决定服务器能生产出什么样内容类型的数据
     *              3、SpringMVC会挨个便利所有容器底层的HttpMessageConverter，看谁能够处理
     *                  1、得到MappingJackson2HttpMessageConverter可以将对象写为json
     *                  2、利用MappingJackson2HTTPMessageConvert将对象转为json再写出去
     *              HttpMessageConverter原理：
     *                  1、调用boolean canWrite(Class<?> clazz, @Nullable MediaType mediaType)看是否支持将此Class类型的对象，转换为MediaType类型的对象
     *                  2、MappingJackson2HTTPMessageConvert将Person数据转换为JSON数据
     *                  3、HttpMessageConverter调用void write(T t, @Nullable MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException;
     *                  将JSON数据写入响应报文
     *
     *
     *
     * @return person
     */
    @ResponseBody   //利用返回值处理器里面的消息转换器进行处理
    @GetMapping("/test/person")
    public Person getPerson(HttpServletRequest request){
        String accept = request.getHeader("Accept");
        System.out.println(accept);
        Person person = new Person();
        person.setAge(21);
        person.setBirth(new Date());
        person.setUserName("杨凌波");
        return person;
    }
}
