package org.gof.structural.patterns2.bridge.game.role.impl.bad;

import org.gof.structural.patterns2.bridge.game.role.api.bad.IRole;

public class Role1WithKnife implements IRole {

    @Override
    public void run() {
        System.out.println("Role1 run");
    }

    @Override
    public void jump() {
        System.out.println("Role1 jump");
    }

    @Override
    public void fire() {
        System.out.println("Role1 is cutting");
    }
}
