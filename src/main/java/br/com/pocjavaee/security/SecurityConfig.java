package br.com.pocjavaee.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		CustomizeAuthenticationSuccessHandler customizeAuthenticationSuccessHandler = new CustomizeAuthenticationSuccessHandler();
		
		http.csrf().disable()
	    .authorizeRequests()
	    	.antMatchers("/resources/**", "/javax.faces.resource/**", "/index.xhtml").permitAll()
	        .anyRequest().authenticated()
	    .and()
	    .formLogin()
	        // Aqui dizemos que temos uma página customizada.
	        .loginPage("/login.xhtml").successHandler(customizeAuthenticationSuccessHandler)
	        // Mesmo sendo a página de login, precisamos avisar
	        // ao Spring Security para liberar o acesso a ela.
	        .permitAll();
		
		/*http.authorizeRequests().
		antMatchers("/secure/**").access("hasRole('ROLE_ADMIN')").
		and().formLogin().  //login configuration
        loginPage("/customLogin.xhtml").
        loginProcessingUrl("/appLogin").
        usernameParameter("app_username").
        passwordParameter("app_password").
        defaultSuccessUrl("/template/layoutLogado.xhtml").	
		and().logout().    //logout configuration
		logoutUrl("/appLogout"). 
		logoutSuccessUrl("/customLogin.xhtml");*/
		
		/*http
	    .authorizeRequests()
	    	.antMatchers("/resources/**", "/lib/**", "/index.xhtml", "/customLogin.xhtml").permitAll()
	        .anyRequest().authenticated()
	    .and()
	    .formLogin()
	        // Aqui dizemos que temos uma página customizada.
	        .loginPage("/customLogin.xhtml") 
	        // Mesmo sendo a página de login, precisamos avisar
	        // ao Spring Security para liberar o acesso a ela.
	        .permitAll(); */

	} 
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password("456").roles("USER");*/
		
		auth
		.inMemoryAuthentication()
			.passwordEncoder(NoOpPasswordEncoder.getInstance())
			.withUser("user").password("123")
				.roles("USER")
			.and()
			.withUser("admin").password("456")
	            .roles("ADMIN");
		
	}	
}  
