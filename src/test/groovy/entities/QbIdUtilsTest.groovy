package entities

import org.junit.jupiter.api.Test
import utils.QbIdUtils

import static org.junit.jupiter.api.Assertions.assertEquals

public class QbIdUtilsTest
{
	@Test
	public void testIncrement()
	{
		String startValue = "0000000000000000"
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000001", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000002", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000003", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000004", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000005", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000006", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000007", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000008", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000009", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000A", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000B", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000C", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000D", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000E", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000F", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000G", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000H", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000I", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000J", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000K", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000L", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000M", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000N", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000O", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000P", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000Q", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000R", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000S", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000T", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000U", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000V", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000W", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000X", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000Y", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000Z", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000a", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000b", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000c", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000d", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000e", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000f", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000g", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000h", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000i", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000j", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000k", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000l", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000m", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000n", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000o", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000p", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000q", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000r", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000s", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000t", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000u", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000v", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000w", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000x", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000y", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("000000000000000z", startValue)
		
		startValue = QbIdUtils.incrementAbmString(startValue)
		assertEquals("0000000000000010", startValue)
		
	}
}