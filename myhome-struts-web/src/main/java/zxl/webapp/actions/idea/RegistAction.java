package zxl.webapp.actions.idea;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import zxl.util.Struts2Util;

import java.util.Random;

/**
 * @author xiliang.zxl
 * @date 2015-11-08 下午12:29
 */
@Component
@Scope("prototype")
@Namespace("/idea14")
public class RegistAction extends ActionSupport {

    private String name;

    @Action(value = "show" , results = @Result(name = SUCCESS ,location = "/WEB-INF/content/idea/regist.jsp"))
    public String register(){
        return SUCCESS;
    }

    @Action(value = "register")
    public void doRegist(){
        Random r = new Random();
        Struts2Util.renderText("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
