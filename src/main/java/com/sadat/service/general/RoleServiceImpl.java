package com.sadat.service.general;

import com.sadat.model.Role;
import com.sadat.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findRole(String role){

        return roleRepository.findByRole(role);
    }

    @Override
    public Role saveRole(Role role){

        if(findRole(role.getRole()) == null){

            return roleRepository.save(role);
        }

        return null;
    }
}
