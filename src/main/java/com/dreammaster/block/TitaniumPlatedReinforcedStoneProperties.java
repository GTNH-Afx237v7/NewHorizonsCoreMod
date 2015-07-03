package com.dreammaster.block;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import eu.usrv.yamcore.iface.IExtendedBlockProperties;

/**
 * This is the helper class to define extended properties for your block. If you decide to use it,
 * you *MUST* define every value or it will not register properly or may even crash.
 * @author Namikon
 *
 */
public class TitaniumPlatedReinforcedStoneProperties implements IExtendedBlockProperties
{
    @Override
    public Material getMaterial() { return Material.rock;}

    @Override
    public boolean getUnbreakable() { return false;	}

    @Override
    public int getHarvestLevel() { return 4; }

    @Override
    public int getOpacity() { return 0; }

    @Override
    public float getHardness() { return 200.0F; }

    @Override
    public float getLightLevel() { return 0; }

    @Override
    public float getResistance() { return 900; }

    @Override
    public String getBlockName() { return "TitaniumPlatedReinforcedStone"; }

    @Override
    public String getTextureName() { return ""; }

    @Override
    public String getHarvestToolClass() { return "pickaxe"; }

    @Override
    public SoundType getStepSound() { return Block.soundTypeStone; }
}