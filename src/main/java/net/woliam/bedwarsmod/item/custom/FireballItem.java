package net.woliam.bedwarsmod.item.custom;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class FireballItem extends Item {
    public FireballItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        double d2 = 0;
        double d3 = 0;
        double d4 = 0;
        pPlayer.getCooldowns().addCooldown(this, 20);
        if (!pLevel.isClientSide) {
            double d1 = 4.0D;
            Vec3 vec3 = pPlayer.getViewVector(1.0F);
            d2 = pPlayer.getX() - (pPlayer.getX() + vec3.x * 4.0D);
            d3 = pPlayer.getY() - (pPlayer.getY() + vec3.y * 4.0D);
            d4 = pPlayer.getZ() - (pPlayer.getZ() + vec3.z * 4.0D);
        }
        Vec3 vec3 = pPlayer.getViewVector(1.0F);
        LargeFireball largefireball = new LargeFireball(pLevel, pPlayer, -d2, -d3, -d4, 3);
        largefireball.setPos(pPlayer.getX() + vec3.x * 2.0D, pPlayer.getY(0.5D) + 0.5D, largefireball.getZ() + vec3.z * 2.0D);
        pLevel.addFreshEntity(largefireball);
        return super.use(pLevel, pPlayer, pUsedHand);

    }
}
/*if (this.chargeTime == 20) {
        double d1 = 4.0D;
        Vec3 vec3 = this.ghast.getViewVector(1.0F);
        double d2 = livingentity.getX() - (this.ghast.getX() + vec3.x * 4.0D);
        double d3 = livingentity.getY(0.5D) - (0.5D + this.ghast.getY(0.5D));
        double d4 = livingentity.getZ() - (this.ghast.getZ() + vec3.z * 4.0D);
        if (!this.ghast.isSilent()) {
        level.levelEvent((Player)null, 1016, this.ghast.blockPosition(), 0);
        }

        LargeFireball largefireball = new LargeFireball(level, this.ghast, d2, d3, d4, this.ghast.getExplosionPower());
        largefireball.setPos(this.ghast.getX() + vec3.x * 4.0D, this.ghast.getY(0.5D) + 0.5D, largefireball.getZ() + vec3.z * 4.0D);
        level.addFreshEntity(largefireball);
        this.chargeTime = -40;

 */