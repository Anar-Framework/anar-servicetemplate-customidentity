package af.gov.anar.dck.domain.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
	}
//	boolean alreadySetup = false;
//
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private RoleRepository roleRepository;
//	
//	@Autowired
//	private PermissionRepository permissionRepository;
//
//	@Lazy
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	@Override
//	@Transactional
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//	
//		if (alreadySetup)
//		return;
//		Permission readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
//		Permission writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");
//		
//		List<Permission> adminPrivileges = Arrays.asList(readPrivilege, writePrivilege);
//		createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
//		createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));
//		
//		Role adminRole = roleRepository.findByName("ROLE_ADMIN");
//		User user = new User();
//		user.setName("Test");
//		user.setPassword(passwordEncoder.encode("test"));
//		user.setEmail("test@test.com");
//		user.setRoles(Arrays.asList(adminRole));
//		user.setActive(true);
//		userRepository.save(user);
//		
//		alreadySetup = true;
//	}
//
//	@Transactional
//	private Permission createPrivilegeIfNotFound(String name) {
//		Permission privilege = permissionRepository.findByName(name);
//		if (privilege == null) {
//			privilege = new Permission(name);
//			permissionRepository.save(privilege);
//		}
//		return privilege;
//	}
//	
//	@Transactional
//	private Role createRoleIfNotFound(
//		String name, Collection<Permission> privileges) {
//
//		Role role = roleRepository.findByName(name);
//		if (role == null) {
//			role = new Role(name);
//			role.setPermissions(privileges);
//			roleRepository.save(role);
//		}
//		return role;
//	}
}