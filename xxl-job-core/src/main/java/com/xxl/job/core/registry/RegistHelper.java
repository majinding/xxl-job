package com.xxl.job.core.registry;

/**
 * Created by xuxueli on 16/9/30.
 */
public interface RegistHelper {

    public enum RegistType{ EXECUTOR, ADMIN }

    public int registry(String registGroup, String registryKey, String registryValue);

}
