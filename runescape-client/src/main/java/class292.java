import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class292 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	UrlRequest field3357;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	SpritePixels field3358;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lch;)V"
	)
	class292(String var1, UrlRequester var2) {
		try {
			this.field3357 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3357 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lcm;)V"
	)
	class292(UrlRequest var1) {
		this.field3357 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "1783597520"
	)
	SpritePixels method5722() {
		if (this.field3358 == null && this.field3357 != null && this.field3357.isDone()) {
			if (this.field3357.getResponse() != null) {
				this.field3358 = class21.method322(this.field3357.getResponse());
			}

			this.field3357 = null;
		}

		return this.field3358;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILgz;IS)V",
		garbageValue = "-3813"
	)
	static void method5723(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 16384;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field823 = var3.int7 * 128;
		var5.field819 = var3.int5;
		var5.field827 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field829 = var5.field819 + (int)(Math.random() * (double)(var5.field827 - var5.field819));
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1017893852"
	)
	public static void method5724() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
