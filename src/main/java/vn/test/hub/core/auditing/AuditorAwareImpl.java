package vn.test.hub.core.auditing;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // TODO - implement this method
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return Optional.of("system-user");
//        }
//
//        return Optional.of(authentication.getName());

        return Optional.of("Anonymous");
    }
}

