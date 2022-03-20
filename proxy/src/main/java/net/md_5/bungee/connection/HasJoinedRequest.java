package net.md_5.bungee.connection;

public class HasJoinedRequest
{

    private String username;
    private String serverId;
    private String gameID;
    private int result;

    public void setUsername( String username )
    {
        this.username = username;
    }

    public void setServerId( String serverId )
    {
        this.serverId = serverId;
    }

    public void setGameID( String gameID )
    {
        this.gameID = gameID;
    }

    public boolean equals( Object o )
    {
        if ( o == this )
            return true;
        if ( !( o instanceof HasJoinedRequest ) )
            return false;
        HasJoinedRequest other = ( HasJoinedRequest ) o;
        if ( !other.canEqual( this ) )
            return false;
        Object this$username = getUsername(), other$username = other.getUsername();
        if ( ( this$username == null ) ? ( other$username != null ) : !this$username.equals( other$username ) )
            return false;
        Object this$serverId = getServerId(), other$serverId = other.getServerId();
        if ( ( this$serverId == null ) ? ( other$serverId != null ) : !this$serverId.equals( other$serverId ) )
            return false;
        Object this$gameID = getGameID(), other$gameID = other.getGameID();
        return !( ( this$gameID == null ) ? ( other$gameID != null ) : !this$gameID.equals( other$gameID ) );
    }

    protected boolean canEqual( Object other )
    {
        return other instanceof HasJoinedRequest;
    }

    public int hashCode()
    {
        int PRIME = 59;
        result = 1;
        Object $username = getUsername();
        result = result * 59 + ( ( $username == null ) ? 43 : $username.hashCode() );
        Object $serverId = getServerId();
        result = result * 59 + ( ( $serverId == null ) ? 43 : $serverId.hashCode() );
        Object $gameID = getGameID();
        return result * 59 + ( ( $gameID == null ) ? 43 : $gameID.hashCode() );
    }

    public String toString()
    {
        return "HasJoinedRequest(username=" + getUsername() + ", serverId=" + getServerId() + ", gameID=" + getGameID() + ")";
    }

    public HasJoinedRequest( String username, String serverId, String gameID )
    {
        this.username = username;
        this.serverId = serverId;
        this.gameID = gameID;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getServerId()
    {
        return this.serverId;
    }

    public String getGameID()
    {
        return this.gameID;
    }
}
