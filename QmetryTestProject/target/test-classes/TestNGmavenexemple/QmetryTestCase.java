package TestNGmavenexemple;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Use this annotation to override default parameters at class or test level. If
 * Scheduler xml file is provided it will use this parameters for filter.
 * 
 * @author chirag
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({ METHOD, TYPE })
public @interface QmetryTestCase {
	/**
	 * Test case id to be mapped with QMetry test case.
	 * 
	 * @return
	 */
	/**
	 * map with QMetry test case id. separate with comma if more than one test
	 * case id to map
	 */
	String TC_ID() default "";

	/**
	 * @return
	 */
	String build() default "";

	String project() default "";

	String release() default "";

	/**
	 * map with QMetry test case run id. separate with comma if more than one
	 * run id to map
	 * 
	 * @return
	 */
	String runId() default "";

	String testScriptName() default "";

	/**
	 * mark for not to map with QMetry
	 * 
	 * @return
	 */
	boolean skip() default false;
}