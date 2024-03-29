package org.zuul.com.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
 * pre：路由之前
 * routing：路由之时
 * post： 路由之后
 * error：发送错误调用
 * filterOrder：过滤的顺序
 * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        log.info("进入过滤器");
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        String username = request.getParameter("username");
////        String str = service.getByLoginName(username);
////        String email = (String) request.getSession().getAttribute("user.email");
////        if(email == null || email.isEmpty()){
////            ctx.setSendZuulResponse(false);
////            ctx.setResponseStatusCode(403);
////            try {
////                ctx.getResponse().setCharacterEncoding("UTF-8");
////                ctx.getResponse().getWriter().write("请登录");
////            }catch (Exception e){}
////
////            return null;
////        }
//        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
//        Object accessToken = request.getParameter("token");
//        if (accessToken == null) {
//            log.warn("token is empty");
//
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            try {
//                ctx.getResponse().getWriter().write("token is empty");
//            } catch (Exception e) {
//            }
//
//            return null;
//        }
        log.info("ok");
        return null;
    }
}
