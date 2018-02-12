package com.indemnity83.irontanks.common.tiles;

import buildcraft.api.core.IFluidFilter;
import buildcraft.factory.tile.TileTank;
import net.minecraftforge.fluids.FluidStack;

public class CreativeTankTile extends TankTile {
    @Override
    public FluidStack drain(IFluidFilter filter, int maxDrain, boolean doDrain) {
        return super.drain(filter, maxDrain, false);
    }

    public boolean canConnectTo(TileTank tileTank) {
        return false;
    }
}
