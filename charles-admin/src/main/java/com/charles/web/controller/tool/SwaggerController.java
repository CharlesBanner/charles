package com.charles.web.controller.tool;

import com.charles.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * swagger 接口
 * 
 * @author charles
 */
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController extends BaseController
{
    @RequiresPermissions("tool:swagger:view")
    @GetMapping()
    public String index()
    {
        return redirect("/swagger-ui.html");
    }
}
