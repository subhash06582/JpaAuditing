package com.jpa.auditing.util;
import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		// Here user can be fetched from spring security principal
		return Optional.of("Subhash Mishra");
	}

}