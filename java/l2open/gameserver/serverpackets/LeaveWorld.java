package l2open.gameserver.serverpackets;

public class LeaveWorld extends L2GameServerPacket
{
	@Override
	protected final void writeImpl()
	{
		writeC(0x84);
	}
}