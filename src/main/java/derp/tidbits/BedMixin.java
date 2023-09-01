package derp.tidbits;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BedBlock.class)
public class BedMixin {
    @Inject(method = "onUse", at = @At("HEAD"), cancellable = true)
    private void onUseMixin(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {

        // Remove the original createExplosion call
        // Vec3d vec3d = pos.toCenterPos();
        // world.createExplosion((Entity)null, world.getDamageSources().badRespawnPoint(vec3d), (ExplosionBehavior)null, vec3d, 5.0F, true, ExplosionSourceType.BLOCK);

        cir.setReturnValue(ActionResult.SUCCESS); // Set the result to success without creating an explosion
    }
}