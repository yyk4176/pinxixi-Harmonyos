package com.example.myapplication;

import com.example.myapplication.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.fraction.FractionAbility;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.Text;

public class MainAbility extends FractionAbility {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        Component component = findComponentById(ResourceTable.Id_login_image);
        if (component instanceof Image) {
            Image image = (Image) component;
        }
    }
}
