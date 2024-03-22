public class ConfigTest {
    /**
     * @SpringBootConfiguration
     * @EnableAutoConfiguration
     * @ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
     *                @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
     * public @interface SpringBootApplication {
     *
     *  1. 根据这个@EnableAutoConfiguration我们可以得知 这个注解是用来自动配置类的
     *
     *  2. 直接进入@EnableAutoConfiguration的源代码
     */

    /**
     * @AutoConfigurationPackage
     * @Import(AutoConfigurationImportSelector.class)
     * public @interface EnableAutoConfiguration {
     *
     *  3. 进入到了@EnableAutoConfiguration的源代码
     *  我们可以看见这个EnableAutoConfiguration
     *  注解了@Import(AutoConfigurationImportSelector.class)
     *  说明这个注解导入了AutoConfigurationImportSelector这个类
     *
     *  4.继续跟进AutoConfigurationImportSelector这个类
     *
     */

    /**
     * public class AutoConfigurationImportSelector implements DeferredImportSelector, BeanClassLoaderAware,
     * 		ResourceLoaderAware, BeanFactoryAware, EnvironmentAware, Ordered {
     *      ......
     *        @Override
     *    public String[] selectImports(AnnotationMetadata annotationMetadata) {
     * 		if (!isEnabled(annotationMetadata)) {
     * 			return NO_IMPORTS;
     *        }
     * 		AutoConfigurationEntry autoConfigurationEntry = getAutoConfigurationEntry(annotationMetadata);
     * 		return StringUtils.toStringArray(autoConfigurationEntry.getConfigurations());
     *
     * 	    5.  selectImports这个方法是用来返回配置类的
     * 	    根据这个类的返回值可以看出autoConfigurationEntry是由于getAutoConfigurationEntry(annotationMetadata)
     *     才得到的
     *
     *      6. 我们继续跟进这个getAutoConfigurationEntry方法
     *    }
     */


    /**
     * protected AutoConfigurationEntry getAutoConfigurationEntry(AnnotationMetadata annotationMetadata) {
     * 		if (!isEnabled(annotationMetadata)) {
     * 			return EMPTY_ENTRY;
     *                }
     * 		AnnotationAttributes attributes = getAttributes(annotationMetadata);
     * 		List<String> configurations = getCandidateConfigurations(annotationMetadata, attributes);
     * 		.....
     * 		return new AutoConfigurationEntry(configurations, exclusions);*    }
     * 	    7. getAutoConfigurationEntry这个方法的返回值为	AutoConfigurationEntry方法调用的返回值
     * 	       而这个AutoConfigurationEntry调用的参数configurations为配置类
     * 	       configurations是一个List数组 这个数组是由getCandidateConfigurations这个方法调用得到的
     * 	       我们需要进入getCandidateConfigurations这个方法的源代码寻找自动配置类
     */

    /**
     *
     */

    /**
     * protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
     * 		List<String> configurations = new ArrayList<>(
     * 				SpringFactoriesLoader.loadFactoryNames(getSpringFactoriesLoaderFactoryClass(), getBeanClassLoader()));
     * 		ImportCandidates.load(AutoConfiguration.class, getBeanClassLoader()).forEach(configurations::add);
     * 	    Assert为断言方法
     * 		Assert.notEmpty(configurations,
     * 				"No auto configuration classes found in META-INF/spring.factories nor in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports. If you "
     * 						+ "are using a custom packaging, make sure that file is correct.");
     * 		return configurations;
     *        }
     *
     *      8. 这个断言输出的语句为"No auto configuration classes found in META-INF/spring.factories nor in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports. If you "
     *      					+ "are using a custom packaging, make sure that file is correct.");
     *      这个语句告诉我们自动配置类在 META-INF/spring.factories nor in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports.
     *      这俩个文件中
     *
     *      9. 当这个配置信息加载出来之后 就会返回给configurations这个List集合
     *      最终返回到了String[] selectImports这个方法的数组中
     *      这个String[]类型中的数据 最终要加载到IOC容器中的Bean和配置类中
     */

    /**
     *      10. 这两份文件都在起步依赖的web文件中存放着
     *          在Maven: org.springframework.boot:spring-boot-autoconfigure:2.7.5的
     *          spring-boot-autoconfigure-2.7.5.jar的
     *          META-INF中的
     *          spring.factories
     *          或
     *          spring目录下的
     *          org.springframework.boot.autoconfigure.AutoConfiguration.imports
     *          这个文件 最终被import读取 然后加载到IOC容器中
     */
}
