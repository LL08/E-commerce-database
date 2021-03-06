USE [keshe]
GO
/****** Object:  Table [dbo].[youhuiquan]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[youhuiquan](
	[name] [nchar](10) NULL,
	[giveout_sum] [nchar](10) NULL,
	[giveout_num] [nchar](10) NULL,
	[type_area] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[yonghu]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[yonghu](
	[id] [nchar](10) NULL,
	[name] [nchar](10) NULL,
	[sex] [nchar](10) NULL,
	[email] [nchar](10) NULL,
	[age] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shangpin]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shangpin](
	[category] [nchar](10) NULL,
	[factory] [nchar](10) NULL,
	[read_time] [nchar](10) NULL,
	[pic_upload] [nchar](10) NULL,
	[jinhuo_price] [nchar](10) NULL,
	[sell_price] [nchar](10) NULL,
	[name] [nchar](10) NULL,
	[num] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[pinglun]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pinglun](
	[good_or_bad] [int] NULL,
	[star_class] [nchar](10) NULL,
	[comment] [nchar](10) NULL,
	[pic] [image] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[miaosha_shangpin]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[miaosha_shangpin](
	[id] [nchar](10) NULL,
	[price_before] [nchar](10) NULL,
	[price_now] [nchar](10) NULL,
	[start_time] [nchar](10) NULL,
	[end_time] [nchar](10) NULL,
	[storage] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[miaosha_dingdan]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[miaosha_dingdan](
	[user] [nchar](10) NULL,
	[payment] [nchar](10) NULL,
	[id] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[kabao]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[kabao](
	[owner] [nchar](10) NULL,
	[deadline] [nchar](10) NULL,
	[usetime] [nchar](10) NULL,
	[createtime] [nchar](10) NULL,
	[category] [nchar](10) NULL,
	[id] [nchar](10) NULL,
	[status] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[gouwuche]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[gouwuche](
	[owner_id] [nchar](10) NULL,
	[sum] [nchar](10) NULL,
	[id] [nchar](10) NULL,
	[goodsid] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[dingdan]    Script Date: 12/12/2019 15:54:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dingdan](
	[addr] [nchar](10) NULL,
	[num] [nchar](10) NULL,
	[status] [nchar](10) NULL,
	[Create_time] [nchar](10) NULL,
	[Set_up_time] [nchar](10) NULL,
	[Salername] [nchar](10) NULL,
	[buyer_name] [nchar](10) NULL,
	[buyer_phone] [nchar](10) NULL,
	[total_price] [int] NULL
) ON [PRIMARY]
GO
