#include "Connector.h"
#include <stdint.h>

#include "../blackrussia/Java.h"

const char* g_szServerNames[MAX_SERVERS] = {
	"BLACK RUSSIA | RED",
	"BLACK RUSSIA | TEST"
};

const CSetServer::CServerInstanceEncrypted g_sEncryptedAddresses[MAX_SERVERS] = {	
	CSetServer::create("5.39.108.54", 1, 16, 1309, true), // указывать тут
	CSetServer::create("5.39.108.54", 1, 16, 1309, true) // и тут тоже что сверху	
	//CSetServer::create("185.189.15.22", 1, 16, 6643, true), // указывать тут
	//CSetServer::create("185.189.15.22", 1, 16, 6643, true) // и тут тоже что сверху		
};