package com.pwx.config;

import com.pwx.entity.User;
import org.springframework.context.annotation.Import;

@Import({AnimalConfig.class, RoleImportSelector.class, PermissionImportBeanDefinitionRegistrar.class, User.class})
public class ImportAutoConfig {
}
