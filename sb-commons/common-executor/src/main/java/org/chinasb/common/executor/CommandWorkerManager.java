package org.chinasb.common.executor;

/**
 * 指令工作器管理
 * @author zhujuan
 */
public interface CommandWorkerManager {
    /**
     * 获得指令解析器
     * @param command
     * @return
     */
	public CommandResolver getResolver(String command);
}