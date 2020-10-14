package com.charles.web.controller.manage;

import com.charles.common.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: GanZiB
 * Date: 2020-10-14
 * Time: 15:19
 */
@Controller
@RequestMapping("/manage/dataSync")
public class DataSyncController extends BaseController {
    private String prefix = "manage/data_sync";
}
