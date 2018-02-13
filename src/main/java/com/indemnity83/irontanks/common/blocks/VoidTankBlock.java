package com.indemnity83.irontanks.common.blocks;

import com.indemnity83.irontanks.common.tiles.VoidTankTile;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class VoidTankBlock extends StackableTankBlock {
    public VoidTankBlock(String tankName, int tankCapacity) {
        super(tankName, tankCapacity);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("irontanks.tooltip.void_tank"));
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new VoidTankTile().withCapacity(this.getTankCapacity());
    }
}
