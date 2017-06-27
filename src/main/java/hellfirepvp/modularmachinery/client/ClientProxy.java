/*******************************************************************************
 * HellFirePvP / Modular Machinery 2017
 *
 * This project is licensed under GNU GENERAL PUBLIC LICENSE Version 3.
 * The source code is available on github: https://github.com/HellFirePvP/ModularMachinery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.modularmachinery.client;

import hellfirepvp.modularmachinery.common.CommonProxy;
import net.minecraftforge.common.MinecraftForge;

/**
 * This class is part of the Modular Machinery Mod
 * The complete source code for this mod can be found on github.
 * Class: ClientProxy
 * Created by HellFirePvP
 * Date: 26.06.2017 / 21:01
 */
public class ClientProxy extends CommonProxy {

    public static ClientScheduler clientScheduler = new ClientScheduler();

    @Override
    public void preInit() {
        MinecraftForge.EVENT_BUS.register(clientScheduler);

        super.preInit();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

}
