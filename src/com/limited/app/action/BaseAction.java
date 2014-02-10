
package com.limited.app.action;

import java.util.Map;
import java.util.Stack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.limited.app.service.BaseService;
import com.limited.app.util.ServiceLocator;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class BaseAction extends ActionSupport
    implements Preparable, ServletRequestAware, ServletResponseAware, ParameterAware
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Log logger = LogFactory.getLog("com/limited/app/action/BaseAction");
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private Map<String,String[]> params;
    private static WebApplicationContext ctx = null;
    private ActionContext actionCtx;
    static final String LAST_ACTION = "lastaction";

    static 
    {
        ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
    }
    public BaseAction()
    {
        actionCtx = null;
    }

    public void prepare()
        throws Exception
    {
        logger.debug("in prepare");
    }

    public void setServletResponse(HttpServletResponse arg0)
    {
        logger.debug("in setServletResponse");
        servletResponse = arg0;
    }

    public void setServletRequest(HttpServletRequest arg0)
    {
        logger.debug("in setServletRequest");
        servletRequest = arg0;
    }

    public void setParameters(Map<String,String[]> arg0)
    {
        params = arg0;
    }

    protected HttpServletRequest getServletRequest()
    {
        return servletRequest;
    }

    protected HttpServletResponse getServletResponse()
    {
        return servletResponse;
    }

    protected Map<String,String[]> getParams()
    {
        return params;
    }

    protected String getRequestParm(String key)
    {
        return ((String[])getParams().get(key))[0];
    }

    protected static WebApplicationContext getCtx()
    {
        return ctx;
    }

    protected static BaseService getService(String serviceName)
    {
        try
        {
            return (BaseService)getCtx().getBean(ServiceLocator.getProp(serviceName));
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public ActionContext getActionCtx()
    {
        if(actionCtx == null)
            actionCtx = ActionContext.getContext();
        return actionCtx;
    }

    public void setLastAction()
    {
    	@SuppressWarnings("unchecked")
		Stack<String> actionStack = (Stack<String>)getServletRequest().getSession().getAttribute("lastAction");
    	if (actionStack==null){
    		actionStack=new Stack<String>();
    	}
    	logger.debug("setLastAction:" + getActionCtx().getName());
    	actionStack.push(getActionCtx().getName());
        getServletRequest().getSession().setAttribute("lastAction", actionStack);
    }

    public String getLastAction()
    {
    	@SuppressWarnings("unchecked")
		Stack<String> actionStack = (Stack<String>)getServletRequest().getSession().getAttribute("lastAction");
    	if (actionStack==null){
    		return null;
    	}
    	String lastaction = actionStack.pop();
    	logger.debug("getLastAction:" + lastaction);
    	return lastaction;
    }

    //do not pop item from stack. only get.
    public String getLastAction(String action)
    {
    	@SuppressWarnings("unchecked")
		Stack<String> actionStack = (Stack<String>)getServletRequest().getSession().getAttribute("lastAction");
    	if (actionStack==null){
    		return null;
    	}
        String l = actionStack.lastElement();
        if(l == null)
            return action;
        else{
            return l;
        }
    }

    public void clearLastAction()
    {
        getServletRequest().getSession().removeAttribute("lastAction");
    }

    public void setContextObj(Object o)
    {
    	@SuppressWarnings("unchecked")
		Stack<Object> ctxObjStack = (Stack<Object>)getServletRequest().getSession().getAttribute("contextObj");
    	if (ctxObjStack==null){
    		ctxObjStack=new Stack<Object>();
    	}
    	ctxObjStack.push(o);
        getServletRequest().getSession().setAttribute("contextObj", ctxObjStack);
    }

    public Object getContextObj()
    {
    	@SuppressWarnings("unchecked")
		Stack<Object> ctxObjStack = (Stack<Object>)getServletRequest().getSession().getAttribute("contextObj");
    	if (ctxObjStack==null){
    		return null;
    	}
    	return ctxObjStack.pop();    	
    }

    public void clearContextObj()
    {
        getServletRequest().getSession().removeAttribute("contextObj");
    }

    public String nextAction(String action)
    {
        String next = getLastAction();
        if(next == null)
            return action;
        else
            return "lastaction";
    }


}
